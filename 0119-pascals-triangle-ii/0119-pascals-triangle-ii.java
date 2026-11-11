class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for(int j = 0; j < row.size()-1; j++){
                int sum = row.get(j) + row.get(j+1);
                newRow.add(sum);
            }
            newRow.add(1);
            row = newRow;
        }
        return row;
    }
}