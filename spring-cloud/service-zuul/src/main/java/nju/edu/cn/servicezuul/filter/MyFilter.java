package nju.edu.cn.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuan on 2017/10/30.
 */
// zuul不仅仅是路由，并且还能过滤，做一些安全验证
@Component
public class MyFilter extends ZuulFilter {
    private static Logger LOG = LoggerFactory.getLogger(ZuulFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        LOG.info("{} >>> {}",request.getMethod(), request.getRequestURL().toString());
        Object accessToken = request.getParameter("token");
        if( accessToken == null){
            LOG.warn("token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);

            try{
                requestContext.getResponse().getWriter().write("token is empty");
            }catch (Exception e){
                return null;
            }
        }
        LOG.info("OK");
        return null;
    }
}
