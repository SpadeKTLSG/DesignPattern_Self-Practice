package DesignPatternEGs.Behavioral.ChainOfResponsibility.LeaveApproval;

// 抽象假条审批者类：抽象处理者类
public abstract class Approvor {
    protected Approvor successor;
    protected String name;

    public Approvor(String name) {
        this.name = name;
    }

    public void setSuccessor(Approvor successor) {
        this.successor = successor;
    }

    public abstract void processApproval(LeaveApproval leaveApproval);
}
