package util.exception;

import util.function.Log;

/**
 *
 * 未找到DAO映射的异常
 *
 * Created by Administrator on 2018/7/6.
 *
 */
public class MapperNotFoundException extends Exception {

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        Log.addErrorLog("数据访问对象库加载失败。");
    }
}
