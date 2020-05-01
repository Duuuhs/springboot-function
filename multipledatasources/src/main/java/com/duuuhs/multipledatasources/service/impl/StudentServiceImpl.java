package com.duuuhs.multipledatasources.service.impl;

import com.duuuhs.multipledatasources.dao.BaseDao;
import com.duuuhs.multipledatasources.dao.cluster.StudentDao;
import com.duuuhs.multipledatasources.model.Student;
import com.duuuhs.multipledatasources.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Duuuhs
 * @description
 * @create 2020/4/29 23:17
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student>  implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    protected BaseDao<Student> getMapper() {
        return this.studentDao;
    }

}
