/**
 * Creates a User Profile.
 *
 * @author lipemlidjob
 * @date 2026-11-09
 */
public class Solution {
    public static void main(String[] args) {
        int itemPrice = 4, itemCount = 3, discount = 2;
        int totalCost = itemPrice * itemCount - discount;
        String finalMessage = "Total cost: " + totalCost;

        System.out.println(finalMessage);
    }
}