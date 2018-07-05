package view.receivers;

import util.Attribute;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * Created by Administrator on 2018/7/4.
 * @author 杨晓宇
 *
 * 注册请求接收接口
 * 用于处理一个注册请求
 *
 */
public interface RegisterReceiver {

    /**
     * 获取注册状态
     * @param request 一个注册请求
     * @return 状态码，0表示成功，1表示用户已存在，2表示密码不一致，3表示数据库失败
     * @Attribute User
     */

    int registerFromRequest(@Attribute(User = "user") HttpServletRequest request);

    //TODO:更多接口请在这里定义
}