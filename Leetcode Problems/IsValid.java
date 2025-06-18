class IsValid {
    public boolean isValid(String s) {
        Stack<Character> s_r=new Stack<Character>();
        Char[] arr=s.toCharArray();
        Char ch;
        for(ch : arr){
            if(ch == '(' || ch == '{' || ch == '['){
                s_r.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(s_r.isEmpty){return false}
                else if
            }
        }
    }
}