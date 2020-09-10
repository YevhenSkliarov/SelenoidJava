package helpers;

public class App {
    public CommonHelper common;
    public LoginPageHelper login;
    public DashboardHelper dashboard;

    public App() {
        this.common = new CommonHelper();
        this.login = new LoginPageHelper();
        this.dashboard = new DashboardHelper();
    }
}
