package util.function;

import model.DAO.UserDAO;
import model.Managers;
import org.apache.ibatis.session.SqlSession;
import util.exception.MapperNotFoundException;

/**
 *
 *
 * 加载所有接口类
 * @see Managers 数据库管理者集
 *
 * Created by Administrator on 2018/7/4.
 * @author 杨晓宇
 */
public class Loader {

    /**
     * 加载所有后台管理接口
     * @param session
     */
    public static void LoadDAOs(SqlSession session) throws MapperNotFoundException {
        Managers.UserManager=session.getMapper(UserDAO.class);
        if(Managers.UserManager==null)throw new MapperNotFoundException();
    }

}