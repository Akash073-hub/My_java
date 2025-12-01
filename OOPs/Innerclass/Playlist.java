package Innerclass;

public class Playlist{
    static void main() {
        SongList var_2 = new SongList();
        var_2.addSong("Song A");
        var_2.addSong("Song B");
        var_2.addSong("Song C");
        var_2.printAllSongs();
    }
}

class SongList {
    private class SongNode {
        String title;
        SongNode next;

        SongNode(String title) {
            this.title = title;
        }
    }

    private SongNode head;   // First song
    private SongNode tail;

    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printAllSongs() {
        SongNode current = head;
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }
}