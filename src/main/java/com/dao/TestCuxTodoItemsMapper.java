package com.dao;

import com.model.CuxTodoItems;
import com.model.CuxUsers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestCuxTodoItemsMapper {

    void insert(@Param("item") CuxTodoItems cuxTodoItems);

    void insert2(CuxTodoItems cuxTodoItems);

    List<CuxTodoItems> selectItembyparam1(@Param("id") int userId,@Param("pty") String Priority);


    List<CuxTodoItems> selectItembyparam2(@Param("item") CuxTodoItems cuxTodoItems);

    List<CuxTodoItems> selectItembyparam3(@Param("it") CuxTodoItems cuxTodoItems, @Param("us")CuxUsers user);

    List<CuxTodoItems> selectItembyparam4( int userId);

    List<CuxTodoItems> selectItembyparam5( int userId,String Priority);

    List<CuxTodoItems> selectItembyparam6( CuxTodoItems cuxTodoItems);

    List<CuxTodoItems> selectItembyparam7( CuxTodoItems cuxTodoItems, CuxUsers user);
}