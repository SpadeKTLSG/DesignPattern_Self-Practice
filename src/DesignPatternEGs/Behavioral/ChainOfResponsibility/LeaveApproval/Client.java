package DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval;

import DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.ApprovorImpl.Director;
import DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.ApprovorImpl.Manager;
import DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.ApprovorImpl.President;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        Approvor director, manager, president;
        director = new Director("主任");
        manager = new Manager("经理");
        president = new President("总经理");

        // 创建责任链
        director.setSuccessor(manager);
        manager.setSuccessor(president);

        // 创建请假审批请求
        LeaveApproval leaveApproval;
        leaveApproval = new LeaveApproval();
        leaveApproval.setName("张无忌");
        leaveApproval.setStartDate(new Date());
        leaveApproval.setLeaveDays(1);
        director.processApproval(leaveApproval);

        leaveApproval.setLeaveDays(5);
        director.processApproval(leaveApproval);

        leaveApproval.setLeaveDays(10);
        director.processApproval(leaveApproval);

        leaveApproval.setLeaveDays(30);
        director.processApproval(leaveApproval);
    }
}
