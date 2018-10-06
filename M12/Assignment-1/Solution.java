import java.util.Scanner;
/**
 * Solution class.
 */
final class Solution{
	/**
	 * default constructor.
	 */
	private Solution(){ }

	public static Student[] seatsFilled (final Student[] stud,
	                                     final int vacant,
	                                     final int noreserve,
	                                     final int bc, final int sc,
	                                     final int st) {

		Student[] seats = new Student[vacant];
		for (int i = 0; i < noreserve; i++) seats[i] = stud[i];
		int filled = noreserve;
		int totSz = stud.length;

		for (int i = filled; bc > 0 && i < totSz; i++) {
			if (filled < noreserve + bc && stud[i].category.equals("BC")
			        && filled <= vacant) {
				seats[filled] = stud[i];
				filled += 1;
			}
		}

		// System.out.println(filled);

		for (int i = filled; st > 0 && i < totSz; i++) {
			if (filled < noreserve + bc + st && stud[i].category.equals("ST")
			        && filled <= vacant) {
				seats[filled] = stud[i];
				filled += 1;

			}
		}
		// System.out.println(filled);

		for (int i = filled; sc > 0 && i < totSz; i++) {
			if (filled < noreserve + bc + st + sc && stud[i].category.equals("SC")
			        && filled <= vacant) {
				seats[filled] = stud[i];
				filled += 1;
			}
		}

		return seats;
	}
	/**
	 * main method.
	 * @param args [description]
	 */
  public static void main(String[] args) {

  		int size = 0;
  		Scanner sc = new Scanner(System.in);
  		int lines = sc.nextInt();
  		int vacancy = sc.nextInt();
  		int noReservationVacancy = sc.nextInt();
  		int bcVacancy = sc.nextInt();
  		int scVacancy = sc.nextInt();
  		int stVacancy = sc.nextInt();
  	Student[] stdobj = new Student[lines];

		while(sc.hasNext()){
  			//String[] line = sc.nextLine().split(",");
  			stdobj[size++] = new Student(sc.nextLine());
  		}

  		MergeSort.sort(stdobj);
		for (int i = 0; i < lines; i++){
			System.out.println(stdobj[i]);
		}

		System.out.println();

		Student[] seatsAlloted = seatsFilled(stdobj,
		                                    vacancy, noReservationVacancy,
		                                    bcVacancy, scVacancy, stVacancy);
		for (int i = 0; i < vacancy; i++) {

		 System.out.println(seatsAlloted[i]);
		}


  		}

  	}
