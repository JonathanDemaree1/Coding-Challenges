public class Vote {
    private int upvotes;
    private int downvotes;

    public Vote(int upvotes, int downvotes) throws Exception {
        if (upvotes < 0 || downvotes < 0) {
            throw new Exception("Upvotes and downvotes must be greater than or equal to 0.");
        }
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }
    
    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public int getVoteCount() {
        return upvotes - downvotes;
    }
}
