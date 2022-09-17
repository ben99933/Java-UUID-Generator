package clwhthr.generator.uuid.main;

import java.util.UUID;

public class UUIDGenerator {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println(UUID.randomUUID().toString());
		}else if(args.length==1) {
			try {
				long num = Long.valueOf(args[0]);
				for(long i = 0;i<num;i++) {
					System.out.println(UUID.randomUUID().toString());
				}
			} catch (Exception e) {
				System.out.println("Error : wrong argument!");
			}
		}else {
			System.out.println("Error : wrong argument!");
		}
	}
}
