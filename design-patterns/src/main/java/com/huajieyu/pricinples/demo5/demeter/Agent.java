package com.huajieyu.pricinples.demo5.demeter;

public class Agent {

    private Company company;
    private Fans fans;
    private Star star;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void meeting(){
        System.out.println("粉丝" + fans.getName() + "与明星" + star.getName() + "见面了");
    }

    public void business(){
        System.out.println("公司" + company.getName() + "与明星" + star.getName() + "谈业务");
    }
}
