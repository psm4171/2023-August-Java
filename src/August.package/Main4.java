// n개의 숫자를 입력하여 max, min값 출력 

package August;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

		// 문자열을 숫자열로 변환하는 parseInt로 n개의 숫자를 입력
		int nCnt = Integer.parseInt(br.readLine());
		String str = br.readLine(); 
		String[] splitStr = str.split(" "); 
		
		int max = Integer.parseInt(splitStr[0]);
		int min = Integer.parseInt(splitStr[0]);
		
		if(nCnt > 1) {
			for(int i=1; i<nCnt; i++) {
				int n = Integer.parseInt(splitStr[i]);
				if(max < n) max = n;
				if(min > n) min = n;
			}
		}
		
		bw.append(min + " " + max);
		bw.flush();
	}

}
