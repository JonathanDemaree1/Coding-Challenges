public class App {
    public static void main(String[] args) throws Exception {
        Vote vote1 = new Vote(13, 0);
        Vote vote2 = new Vote(2, 33);
        Vote vote3 = new Vote(132, 132);
        System.out.println(vote1.getVoteCount());
        System.out.println(vote2.getVoteCount());
        System.out.println(vote3.getVoteCount());
    }
}
