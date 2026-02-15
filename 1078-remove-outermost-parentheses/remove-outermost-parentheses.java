class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int result=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(result>0){
                    sb.append('(');
                }
                result++;
            }
            else{
                result--;
                if(result>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}