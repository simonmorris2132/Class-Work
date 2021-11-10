public class Upvote {
    
    public static void run() {
        System.out.println(getVoteCount(9, 5));
    }

    static int getVoteCount(int upvotes,int downvotes) {
    
        if (upvotes >= downvotes) {
            System.out.println(upvotes + " is bigger!");
        } else {
            System.out.println(downvotes + " is bigger!");
        }
        return downvotes;

    }

}
