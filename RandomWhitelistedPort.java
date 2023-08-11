// // // Question no 2(b)
// import java.util.HashSet;
// import java.util.Random;
// import java.util.Set;

// public class RandomWhitelistedPort {
//     private Set<Integer> blacklist;
//     private int k;
//     private Random random;

//     public RandomWhitelistedPort(int k, int[] blacklisted_ports) {
//         this.k = k;
//         this.blacklist = new HashSet<>();
//         for (int port : blacklisted_ports) {
//             blacklist.add(port);
//         }
//         this.random = new Random();
//     }

//     public int get() {
//         int randomPort = random.nextInt(k - blacklist.size()); // Generate a random number within the whitelisted range
        
//         while (blacklist.contains(randomPort)) {
//             randomPort = (randomPort + 1) % k; // Increment and wrap around if the port is blacklisted
//         }
        
//         return randomPort;
//     }

//     public static void main(String[] args) {
//         int[] blacklisted_ports = {2, 3, 5};
//         RandomWhitelistedPort portPicker = new RandomWhitelistedPort(7, blacklisted_ports);
        
//         System.out.println(portPicker.get()); // Should return a whitelisted random port
//         System.out.println(portPicker.get()); // Should return another whitelisted random port
//     }
// }
