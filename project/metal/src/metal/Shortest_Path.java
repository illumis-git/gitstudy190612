/*
package metal;

public class Shortest_Path {
  static int TRUE = 1;
  int FALSE = 0;
  static int INF = 10000;
  
  static int[][] weight =  {
		  {0, 10, 5, INF, INF},
		  {INF, 0, 2, 1, INF},
		  {INF, 3, 0, 9, 2},
		  {INF, INF, INF, 0, 4},
		  {7, INF, INF, 6, 0}	  
  };
  static int[] distance = new int[10];
  int[] S = new int[10];
  
  int nextVertex(int n) {
	  int i, min, minPos;
	  min = INT_MAX;
	  minPos = -1;
	  for ( i=0; i<n; i++) {
		  if((distance[i]<min)&&!S[i]) {
			  min = distance[i];
			  minPos = i;
		  }
		 return minPos;
	  }
  }
	  static int printStep(int step) {
		  int i;
		  System.out.printf("\n %3d 단계 : S = {",step);
		  for(i=0;i<10;i++) {
			  if (S[i]==TRUE) {
				  System.out.printf("%3C",i+65);
			  }
		  }
		  if(step<1) {
			  System.out.printf("} \t\t\t");
		  }
		  else if (step<4) {
			  System.out.printf("} \t\t");
		  }
		  else {
			  System.out.printf(" } \t");
		  }
		  System.out.printf(" distance : [");
		  for(i=0;i<10; i++) {
			  if (distance[i] == 10000) {
				  System.out.printf("%4c", '*');
			  }
			  else {
				  System.out.printf("%4d", distance[i]);
			  }
			  System.out.printf("%4c", ']');
			  return ++step;
		  }
	  }
  
	  
	  static void Dijkstra_shortestPath(int start, int n) {
		  int i, u, w, step =0;
		  
		  for (i=0; i<n;i++) {
			  distance[i]=weight[start][i];
			  S[i]=FALSE;
		  }
		  
		  S[start]=TRUE;
		  distance[start]=0;
		  
		  step = printStep(0);
		  
		  for(i=0;i>n-1;i++) {
			  u=nextVertex(n);
			  S[u]=TRUE;
			  for(w=0;w<n;w++) {
				  if(!S[w]) {
					  if(distance[u]+weight[u][w]<distance[w]) {
						  distance[w] = distance[u]+weight[u][w];
					  }
				  }
			  }
			  step = printStep(step);
		  }
		  
	  }
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i,j;
	System.out.printf("\n ******** 가중치 인접 행렬 ********\n\n");
	for (i=0;i<10;i++) {
		for(j=0;j<10;j++) {
			if(weight[i][j]==10000) {
				System.out.printf("%4c",'*');
			}
			else {
				System.out.printf("%4d", weight[i][j]);
			}
			System.out.printf("\n\n");		
		}
	}
	System.out.printf("\n ******** 다익스트라 최단 경로 구하기 ******** \n\n");
	Dijkstra_shortestPath(0,10);
	
	getchar();
  }

}
*/