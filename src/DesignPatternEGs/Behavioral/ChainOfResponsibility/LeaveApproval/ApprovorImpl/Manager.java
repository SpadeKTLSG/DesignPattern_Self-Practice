package DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.ApprovorImpl;

import DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.Approvor;
import DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval.LeaveApproval;

// 经理审批者类：具体处理者类
public class Manager extends Approvor {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void processApproval(LeaveApproval leaveApproval) {
        if (leaveApproval.getLeaveDays() >= 3 && leaveApproval.getLeaveDays() < 10) {
            System.out.println(name + "审批假条：通过");
        } else {
            successor.processApproval(leaveApproval);
        }
    }
}
