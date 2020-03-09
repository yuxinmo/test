package top.labos.git;

/**
 * 测试
 * 注释：
 * .gitignore和exclude区别：
 *      .gitignore：需要提交的Git仓库，多用于忽略公共性的文件，例：java产生的.classpath | .project | logs/ ...；
 *      exclude：不需要提交Git仓库，用户个人配置文件或某些测试类；
 * .iml文件和.idea文件夹：
 *      .iml是 intellij idea的工程配置文件，里面是当前project的一些配置信息。
 *      .idea存放项目的配置信息，包括历史记录，版本控制信息等。
 * 如果不是基于 GitHub 远程库的最新版所做的修改， 不能推送， 必须先拉
 * 取。拉取下来后如果进入冲突状态， 则按照“分支冲突解决” 操作解决即可
 */
public class TestGit {
    public static void main(String[] args) {
        System.out.println("hello git project!");
        System.out.println("hello git project!");
        //此处删除两行
        System.out.println("hello git project!");
        System.out.println("hello git project!");
    }
    public void test(){
        System.out.println("sadfkhaslfjh");
        //此处删除两行
    }
    public void test2(){
        System.out.println("sadfkhaslfjh");
        System.out.println("sadfkhaslfjh");
        System.out.println("我是最新修改的，在GitHub里修改的");
    }
    public void test3(){
        System.out.println("sadfkhaslfjh");
        System.out.println("sadfkhaslfjh");
        System.out.println("我是最新修改的，在GitHub里修改的2");
        System.out.println("我是最新修改的，在GitHub里修改的2");

    }
}
