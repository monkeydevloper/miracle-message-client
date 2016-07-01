package com.miracle.message.client.im;

import com.miracle.message.client.MessageException;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by HHF on 2016/7/1.
 */
public class DepartmentMessager {

    protected static DateFormat format = new SimpleDateFormat("MMddHHmmssSSS");

    public  void notifyDepartmentCreated(String departmentId) throws MessageException {
        notifyDepartmentChanged(departmentId, "", "I");
    }

    public void notifyDepartmentUpdated(String departmentId) throws MessageException {
        notifyDepartmentChanged(departmentId, "", "U");
    }

    public void notifyDepartmentUpdated(List<String> deptIdList) throws IOException, MessageException {
        if (deptIdList != null && deptIdList.size() > 0) {
            for (String departmentId : deptIdList) {
                notifyDepartmentChanged(departmentId, "", "U");
            }
        }
    }

    public  void notifyDepartmentRemoved(String departmentId,String oldDepartmentParentId) throws MessageException {
        notifyDepartmentChanged(departmentId, oldDepartmentParentId, "D");
    }

    public  void notifyDepartmentMoved(String departmentId, String oldDepartmentParentId) throws MessageException {
        notifyDepartmentChanged(departmentId, oldDepartmentParentId, "M");
    }

    private void notifyDepartmentChanged(String departmentId, String oldParentId, String type) throws MessageException {

    }

}
