package co.yedam.array;


public class ArrayExe2 {
	public static void main(String[] args) {
		
		
		
		Student[] students = new Student[2];
		int max = 0;
		String name = null;
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.score =85;
		
		Student s2 = new Student();
		s2.name = "김길동";
		s2.score =88;
		
		students[0]= s1;
		students[1]= s2;
		
//		System.out.println(students[0].name + students[0].score);
		
		for (int i=0; i<students.length; i++) {
			if(max < students[i].score) {
				max=  students[i].score;
				name =  students[i].name;
			}
		}
		System.out.println(max);
		System.out.println(name);
		
		
		//students[0].name + students[0].score;
		
				String[] names = {"홍길동","김길동"};
				int[] scores = {85, 88};
				 max = 0;
				 name ="";
				for (int i =0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
						name = names[i];
					}
				}
		System.out.printf("최고점: %d, 이름: %s", max, name);
		//1~100 임의의 값
		//5개의합,평균
		//5개중 가장 큰값 찾기
		
		System.out.println("");
	
		int i;
		int sum;
		int[] ary = new int[5];
		for(i=0;i<ary.length;i++) {
			ary[i] = (int) (Math.random()*100+1);
			System.out.println(ary[i]);
		}
		sum = 0;
		for(i=0;i<ary.length;i++) {
			sum = sum + ary[i];
			
		}
		double avg = sum/5;
		System.out.println(sum);
		System.out.println(avg);
		
		
		
//		System.out.println(ary[i]);
	}
}
