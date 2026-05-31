class Solution {
    public String solution(String code) {
        
          StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {

            char ch = code.charAt(idx);

            if (ch == '1') {
                mode = (mode == 0) ? 1 : 0;
            }
            else {
                if (mode == 0 && idx % 2 == 0) {
                    sb.append(ch);
                }
                else if (mode == 1 && idx % 2 == 1) {
                    sb.append(ch);
                }
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}