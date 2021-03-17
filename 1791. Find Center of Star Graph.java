class Solution {
	public int findCenter(int[][] edges) {
        int a=edges[0][0];
        int b=edges[0][1];
        int flag=0;
        for(int i=1;i<edges.length;i++)
        {
            if(edges[i][0]!=a && edges[i][1]!=a)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            return b;
        else
            return a;
	}
}
