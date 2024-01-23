package Exercise.Ex3;
/*  Sơ đồ
+-------------------+
|    Playable       |
+-------------------+
|                   |
| + play(): void    |
|                   |
+-------------------+
        / \
       /   \
+-------------------+
|   AudioPlayer     |
+-------------------+
|                   |
|                   |
+-------------------+

+-------------------+
|   VideoPlayer     |
+-------------------+
|                   |
|                   |
+-------------------+
 */

public class Main {
        public static void main(String[] args) {
            Playable audioPlayer = new AudioPlayer();
            Playable videoPlayer = new VideoPlayer();

            System.out.println("Testing AudioPlayer:");
            audioPlayer.play();

            System.out.println("\nTesting VideoPlayer:");
            videoPlayer.play();
        }
    }
