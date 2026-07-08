class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>>mp= new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String st= strs[i];

            char arr[]=st.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(mp.containsKey(key)==false)
            {
                mp.put( key, new ArrayList<String>());
            }
            mp.get(key).add( st );
        }
        return new ArrayList( mp.values());
    }
}