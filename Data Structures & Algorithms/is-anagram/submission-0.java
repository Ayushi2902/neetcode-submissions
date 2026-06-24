class Solution {
    public boolean isAnagram(String s, String t) {
        int n=0;
        StringBuilder sb = new StringBuilder(t);
        if(s.length()==t.length())
        {
            for(int i=0; i<s.length();i++)
            {
                for(int j = 0 ; j<sb.length();j++)
                {
                    if(s.charAt(i)==sb.charAt(j))
                    {
                        n++;
                        sb.deleteCharAt(j);
                        break;
                    }
                }
            }
            if(n==s.length())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
