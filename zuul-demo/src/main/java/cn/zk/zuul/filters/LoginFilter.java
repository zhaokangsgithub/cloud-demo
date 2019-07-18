package cn.zk.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:  <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date:   <br/>
 *
 * @author
 * @since JDK 1.6
 */
@Component
public class LoginFilter extends ZuulFilter
{
    public static final String FILTER_TYPE = "pre";

    public static final int FILTER_ORDER = 1;

    public static final Boolean FILTER_STATUS = true;



    @Override
    public String filterType()
    {
        return FILTER_TYPE;
    }

    @Override
    public int filterOrder()
    {
        return FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter()
    {
        return FILTER_STATUS;
    }

    @Override
    public Object run()
        throws ZuulException
    {

        RequestContext context = RequestContext.getCurrentContext();

        HttpServletRequest request = context.getRequest();

        String token = request.getParameter("access-token");

        if(StringUtils.isEmpty(token)){
            // 没有token，登录校验失败，拦截
            context.setSendZuulResponse(false);
            // 返回401状态码。也可以考虑重定向到登录页。
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        return null;
    }
}
