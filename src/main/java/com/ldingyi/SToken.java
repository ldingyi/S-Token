package com.ldingyi;

import java.util.List;

public interface SToken {
    /*
    *登录
    * 返回token
    * */
     String login(Object id);
     /*
     * 注销
     * */
     boolean logout();
     /*
     * 查看登录状态
     * */
    boolean isLogin();
    /*
    * 查询当前会话账号id 未登录抛出异常
    *因为考虑前端若类型，直接返回string，或者交给用户来进行转化
    * */
    String getLoginId();
    // 获取当前会话的token值
    String getTokenValue();
    /*
    * 获取当前会话剩余有效期
    * */
    long getTokenTimeout();
    /*
    * 获取账号拥有的权限
    * */
    List<String> getPermissionList();
    /*
    * 判断当前账号时否有此权限
    * */
    boolean hasPermission(String permission);




}
