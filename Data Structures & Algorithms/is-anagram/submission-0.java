class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.replaceAll("\\s", "").toLowerCase();
        t=t.replaceAll("\\s", "").toLowerCase();
        if (s.length() != t.length()) return false;

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return (Arrays.equals(charArray1, charArray2));
    }
}
