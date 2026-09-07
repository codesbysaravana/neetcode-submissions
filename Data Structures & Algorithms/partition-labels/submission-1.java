class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int lastOccurence = s.lastIndexOf(c);
            int nextLastOccurence = 0; 
            String target = "" + c; 
            int idx = i+1;
            while(idx <= lastOccurence) {
                target = target + s.charAt(idx);
                idx++;

                if(idx > lastOccurence) {
                    lastOccurence = checkIdx(target, lastOccurence, s);
                }
            }

            list.add(target.length());
            i = lastOccurence;
        }   


        return list;
    }

    public int checkIdx(String target, int lastOccurence, String s) {
        int maxLast = lastOccurence;

        for(int i=0; i<target.length(); i++) {
            int currentLast = s.lastIndexOf(target.charAt(i));
            
            if(maxLast < currentLast) {
                maxLast = currentLast;
            }
        }

        return maxLast;
    }
}
