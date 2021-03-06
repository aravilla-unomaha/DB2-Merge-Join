
public class join {
	void merge(String outer[][],String inner[][],int okey,int ikey,int ot,int it,int os,int is){
		//To count number of the block parsing
		int ob=0,ib=0;
		int len=outer[0].length;
		int len2=inner[0].length;
		//Output block of size 5 with columns of outer relation
		String output[][]=new String[5][len+(len2-1)];
		System.out.println("Outer relation size "+os+" tuple size "+ot+" inner relation size "+is+" tuple size "+it);
		//To get the particular tuples of the relations.......o is outer and i is inner
		/*ocheck and icheck prevents from printing block numbers if tuple number not incremented.......
		 * 0 if not printed after tuple incremented and i if printed and tuple is not incremented.....
		 * set to 0 once the tuple is incremented 
		 */
		int o=0,i=0,j=0,ocheck=0,icheck=0;
		//checks if one of the relation reached to its end
		while(o<os&&i<is){
			//checking if blocks are even and if the block number is not printed
			if(o%ot==0&&ocheck==0){
				ob++;
				//prevents from printing block number multiple times for same block
				ocheck=1;
				//checking if number of tuples so far are twice the maximum for a block 
				if(o%(2*ot)==0){
						System.err.println("Getting next two blocks of outer relation");
					}	
				System.err.println("Block number  "+ob+" tuple number "+o+" outer relation");			
			}		
			//checking if blocks are even and if the block number is not printed
			if(i%it==0&&icheck==0){
				ib++;
				//prevents from printing block number multiple times for same block
				icheck=1;
				//checking if number of tuples so far are twice the maximum for a block 
				if(i%(it*2)==0){
							System.err.println("Getting next two blocks of inner relation");
						}
				System.err.println("Block number  "+ib+" tuple number "+i+" inner relation");		
			}
			if(outer[o][okey].compareToIgnoreCase(inner[i][ikey])==0){
					for(int u=0;u<len;u++){
						output[j][u]=outer[o][u];
					}
					for(int u=0;u<len2;u++){
						if(u!=ikey)
							output[j][len+u]=inner[i][u];
					}
				//Since the key value is same......we place it in the output block and move both relations to next tuples 
				o++;
				i++;
				//Increasing the size of output block tuples 
				j++;
				icheck=0;
				ocheck=0;
			}
			else if(outer[o][okey].compareToIgnoreCase(inner[i][ikey])>0){
				//Since the outer relation is greater than inner relation.....move the inner relation to next block
				i++;
				//The tuple of inner relation is changed.......should check if the block is also changed
				icheck=0;	
			}
			else{
				//Since the inner relation is greater than outer relation.....move the outer relation to next block
				o++;
				//The tuple of outer relation is changed.......should check if the block is also changed
				ocheck=0;
			}
			
			//Output block is full when it reaches size 5......print the output and point the index to zero for starting over
			if(j==5){
				System.out.println("Output block filled\n");
				for(int k=0;k<5;k++){
					for(int l=0;l<len+(len2-1);l++){
						System.out.print(output[k][l]+"\t");
					}
					System.out.print("\n");
				}
				j=0;
			}
		}
		//Print the other tuples that are left in output after the join is completed
			System.out.println("Join Completed\n");
			for(int k=0;k<j;k++){
				for(int l=0;l<len+(len2-1);l++){
					System.out.print(output[k][l]+"\t");
				}
				System.out.print("\n");
			}
			j=0;
		
	  	}
}
