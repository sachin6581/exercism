class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            if (Character.isUpperCase(data.charAt(i))){
                if(data.charAt(i) + shiftKey == 90)
                    ans.append((char)(data.charAt(i) + shiftKey));
                else{
                    ans.append((char)((data.charAt(i) + shiftKey) % 90 + (data.charAt(i) + shiftKey > 90 ? 64 : 0)));
                }
            }
            else if (Character.isLowerCase(data.charAt(i))){
                if(data.charAt(i) + shiftKey == 122)
                    ans.append((char)(data.charAt(i) + shiftKey));
                else{
                    ans.append((char)((data.charAt(i) + shiftKey) % 122 + (data.charAt(i) + shiftKey > 122 ? 96 : 0)));
                }
            }
            else
                ans.append(data.charAt(i));
        }
        return ans.toString();
    }

}
