package j3;

public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend();
        BoyFriend boyFriend = new BoyFriend();
        Friend girlfriend = new GirlFriend();

        friend.friendInfo();
        boyFriend.friendInfo();
        girlfriend.friendInfo();
    }
}

class Friend {
    public void friendInfo(){
        System.out.println("나는 당신의 친구입니다");
    }
}

class BoyFriend extends Friend{
    public void friendInfo() {
        System.out.println("나는 당신의 남자 친구입니다");
    }
}class GirlFriend extends Friend{
    public void friendInfo() {
        System.out.println("나는 당신의 여자 친구입니다");
    }
}
