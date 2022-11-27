package testing;

import java.util.*;
import java.io.*;



public class Cfg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            
            boolean run = true;
            int chocie;
            
            do {
                
                System.out.println("************************************************");
                System.out.println("Enter number for task: ");

                System.out.println("-------------String operations menu-------------\n");
                System.out.println("1. Length of longest common substring.\n");
                System.out.println("2. Check how many times a pattern is present in the given text.\n");
                System.out.println("3. Length of longest common subsequence.\n");
                System.out.println("4. Check if they are anagrams or not.\n");
                System.out.println("5. Check if a string is a palindrome or not.\n");
                System.out.println("6. Reverse a string.\n");
                System.out.println("7. Check if two strings are isomorphic or not.\n");
                System.out.println("8. Find the number of operations to convert str1 to str2\n");
                System.out.println("9. Find length of the longest palindromic subsequence in the given sequence.\n");
                System.out.println("0. Exit\n");
                System.out.println("************************************************");

                System.out.print("Choice: ");
                chocie = sc.nextInt();

                switch (chocie) {
                    
                    case 1: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Length of longest common substring\n");
                        
                        String s1,s2;

                        System.out.print("Enter String1: ");
                        s1 = input.readLine();

                        System.out.print("Enter String2: ");
                        s2 = input.readLine();

                        System.out.println("\nOutput: " + LCSubStr(s1, s2));
                        System.out.println();

                        break;
                    }

                    case 2: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Check how many times a pattern is present in the given text\n");

                        String pat,txt;
                
                        System.out.print("Enter Pattern: ");
                        pat = input.readLine();

                        System.out.print("Enter Text: ");
                        txt = input.readLine(); 

                        System.out.println("\nOutput: " + rabinKarp(pat, txt));
                        System.out.println();

                        break;
                    }
                    
                    case 3: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Length of longest common subsequence\n");

                        String s1,s2;

                        System.out.print("Enter String1: ");
                        s1 = input.readLine();

                        System.out.print("Enter String2: ");
                        s2 = input.readLine();

                        System.out.println("\nOutput: " + LCS(s1, s2));
                        System.out.println();

                        break;
                    }
                    
                    case 4: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Check if they are anagrams or not\n");

                        String s1,s2;

                        System.out.print("Enter String1: ");
                        s1 = input.readLine();

                        System.out.print("Enter String2: ");
                        s2 = input.readLine();

                        System.out.println("\nOutput: " + areAnagrams(s1, s2));
                        System.out.println();

                        break;
                    }
                    
                    case 5: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Check if a string is a palindrome or not\n");

                        String str;

                        System.out.print("Enter the String to be checked: ");
                        str = input.readLine();

                        System.out.println("\nOutput: " + isPalindrome(str));
                        System.out.println();

                        break;
                    }
                    
                    case 6: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Reverse a string\n");

                        String str;

                        System.out.print("Enter the String to be reversed: ");
                        str = input.readLine();

                        System.out.println("\nOutput: " + reverseString(str));
                        System.out.println();

                        break;
                    }
                    
                    case 7: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Check if two strings are isomorphic or not\n");

                        String str1,str2;

                        System.out.print("Enter String1: ");
                        str1 = input.readLine();

                        System.out.print("Enter String2: ");
                        str2 = input.readLine();

                        System.out.println("\nOutput: " + areIsomorphic(str1, str2));
                        System.out.println();

                        break;
                    }
                    
                    case 8: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Find the number of operations to convert str1 to str2\n");

                        String str1,str2;

                        System.out.print("Enter String1: ");
                        str1 = input.readLine();

                        System.out.print("Enter String2: ");
                        str2 = input.readLine();

                        System.out.println("\nOutput: " + editDistDP(str1, str2));
                        System.out.println();

                        break;
                    }
                    
                    case 9: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Find length of the longest palindromic subsequence in the given sequence.\n");

                        String seq;

                        System.out.print("Enter the Sequence: ");
                        seq = input.readLine();

                        System.out.println("\nOutput: " + LPS(seq));
                        System.out.println();
                        break;
                    }

                    case 10: 
                    {
                        System.out.println();
                        System.out.println("Selected choice: Length of longest common substring\n");
                        System.out.println("ok");
                        System.out.println();
                        break;
                    }
                    
                    case 0: 
                    {
                        System.out.println();
                        run = false;
                        System.out.println();
                        break;
                    }

                    default:
                    {
                        break;
                    }
                }

            } while (run);

            System.out.println();
            System.out.println("**** Good Bye **** ");

        } catch (

        Exception e) {
            
            System.out.println(e);
            
        } finally {
            
            sc.close();
        
        }

    }


    // Function for finding length of Longest Common SubString.
    static int LCSubStr(String s1, String s2)
    {
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();  

        int m = s1.length();
        int n = s2.length(); 


        // Create a table to store
        // lengths of longest common
        // suffixes of substrings.
        // Note that LCSuff[i][j]
        // contains length of longest
        // common suffix of
        // X[0..i-1] and Y[0..j-1].
        // The first row and first
        // column entries have no
        // logical meaning, they are
        // used only for simplicity of program
        int LCStuff[][] = new int[m + 1][n + 1];
    
        // To store length of the longest
        // common substring
        int result = 0;

        // Following steps build
        // LCSuff[m+1][n+1] in bottom up fashion
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                {
                    LCStuff[i][j] = 0;
                }

                else if (X[i - 1] == Y[j - 1])
                {
                    LCStuff[i][j]
                        = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result,
                                        LCStuff[i][j]);
                }

                else
                {
                    LCStuff[i][j] = 0;
                }
            }
        }
        return result;
    }


    // Function for finding No.of times a pattern occured in a text.
    static int rabinKarp(String pat, String txt)
    {
        int d = 256;

        int q = 101;

        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;
 
        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++) 
        {
            h = (h * d) % q;
        }
 
        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++) 
        {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        int count = 0;
 
        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) 
        { 
        	
        	
        	
        	
 
            // Check the hash values of current window of
            // text and pattern. If the hash values match
            // then only check for characters one by one
            if (p == t) 
            {
                /* Check for characters one by one */
                for (j = 0; j < M; j++) 
                {
                    if (txt.charAt(i + j) != pat.charAt(j)) 
                    {
                        break;
                    }
                }
 
                // if p == t and pat[0...M-1] = txt[i, i+1,
                // ...i+M-1]
                if (j == M) 
                {
                    // System.out.println(
                    //     "Pattern found at index " + i);
                    count++;
                }
            }
 
            // Calculate hash value for next window of text:
            // Remove leading digit, add trailing digit
            if (i < N - M) 
            {
                t = (d * (t - txt.charAt(i) * h)
                    + txt.charAt(i + M))
                    % q;
 
                // We might get negative value of t,
                // converting it to positive
                if (t < 0) 
                {
                    t = (t + q);
                }
            }
        }

        return count;
    }



    // Function for finding length of Longest Common Subsequence.
    static int LCS(String s1, String s2) 
    { 
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();  

        int m = s1.length();
        int n = s2.length();

        int L[][] = new int[m+1][n+1]; 
    
        /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
            that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=m; i++) 
        { 
            for (int j=0; j<=n; j++) 
            { 
                if (i == 0 || j == 0) 
                {
                    L[i][j] = 0; 
                }

                else if (X[i-1] == Y[j-1]) 
                {
                    L[i][j] = L[i-1][j-1] + 1; 
                }

                else
                {   
                    if(L[i-1][j] > L[i][j-1]) 
                    {
                        L[i][j] = L[i-1][j];
                    }

                    else 
                    {
                        L[i][j] = L[i][j-1];
                    }
                }
            } 
        } 
        return L[m][n]; 
    } 
    

    /* Utility function to get max of 2 integers */
    // static int max(int a, int b) 
    // { 
    //     return (a > b)? a : b; 
    // } 


    // Function for finding whether two strings are anagrams or not.
    static boolean areAnagrams(String s1, String s2)
    {
        s1 = s1.toLowerCase();

        s2 = s2.toLowerCase();

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();  


        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
        {
            return false;
        }
 
        // Sort both the strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // str1 = strSort(new String(str1));
        // str2 = strSort(new String(str1));

//        char temp1, temp2, i;


        // Sorting characters present in String 1
        // i=0;
        // while (i < str1.length) 
        // {
        //     int j = i + 1;
        //     while (j < str1.length) 
        //     {
        //         if (str1[j] < str1[i]) 
        //         {
        //             // Comparing the characters one by one
        //             temp1 = str1[i];
        //             str1[i] = str1[j];
        //             str1[j] = temp1;
        //         }
        //         j += 1;
        //     }
        //     i += 1;
        // }


        // Sorting characters present in String 1
        // i=0;
        // while (i < str2.length) 
        // {
        //     int j = i + 1;
        //     while (j < str2.length) 
        //     {
        //         if (str2[j] < str2[i]) 
        //         {
        //             // Comparing the characters one by one
        //             temp2 = str2[i];
        //             str2[i] = str2[j];
        //             str2[j] = temp2;
        //         }
        //         j += 1;
        //     }
        //     i += 1;
        // }
 

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
        {
            if (str1[i] != str2[i])
            {
                return false;
            }
        }
 
        return true;
    }

    
    // static char[] strSort(String str) 
    // {
    //     char arr[] = str.toCharArray();
 
    //     // Nested loops for comparison of characters
    //     // in above character array
       
    //     char temp;
 
    //     int i = 0;
    //     while (i < arr.length) 
    //     {
    //         int j = i + 1;
    //         while (j < arr.length) 
    //         {
    //             if (arr[j] < arr[i]) 
    //             {
                   
    //                 // Comparing the characters one by one
    //                 temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //             j += 1;
    //         }
    //         i += 1;
    //     }

    //     // String sorted_str = "";

    //     // for(i=0; i<arr.length(); i++) {
    //     //     sorted_str += ch[i];
    //     // }

    //     return arr;
    // }


    // Function for finding whether a string is palindrome or not.
    static boolean isPalindrome(String str)
    {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) 
        {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }


    // Function for finding reverse of a string.
    static String reverseString(String str) {

        char ch[]=str.toCharArray();  

        //Output will be stored in this variable
        String rev=""; 

        int i;  

        for(i=ch.length-1; i>=0; i--)
        {  
            rev += ch[i];  
        }  
        return rev;
    }


    // Function to find whether two strings Isomorphic or not.
    static boolean areIsomorphic(String str1, String str2)
    {
        int size = 256;

        int m = str1.length();
        int n = str2.length();
 
        // Length of both strings must be same for one to
        // one correspondence
        if (m != n)
        {
            return false;
        }
 
        // To mark visited characters in str2
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);
 
        // To store mapping of every character from str1 to
        // that of str2. Initialize all entries of map as
        // -1.
        int[] map = new int[size];
        Arrays.fill(map, -1);
 
        // Process all characters one by on
        for (int i = 0; i < n; i++) 
        {
            // If current character of str1 is seen first
            // time in it.
            if (map[str1.charAt(i)] == -1) 
            {
                // If current character of str2 is already
                // seen, one to one mapping not possible
                if (marked[str2.charAt(i)] == true) 
                {
                    return false;
                }
 
                // Mark current character of str2 as visited
                marked[str2.charAt(i)] = true;
 
                // Store mapping of current characters
                map[str1.charAt(i)] = str2.charAt(i);
            }
 
            // If this is not first appearance of current
            // character in str1, then check if previous
            // appearance mapped to same character of str2
            else if (map[str1.charAt(i)] != str2.charAt(i))
            {
                return false;
            }
        }
 
        return true;
    }



    // Function to find number of operations to convert str1 to str2.
	static int editDistDP(String str1, String str2)
	{
        int m = str1.length();

        int n = str2.length();

		// Create a table to store results of subproblems
		int dp[][] = new int[m + 1][n + 1];

		// Fill d[][] in bottom up manner
		for (int i = 0; i <= m; i++) 
        {
			for (int j = 0; j <= n; j++) 
            {
				// If first string is empty, only option is
				// to insert all characters of second string
				if (i == 0)
                {
					dp[i][j] = j; // Min. operations = j
                }

				// If second string is empty, only option is
				// to remove all characters of second string
				else if (j == 0)
                {
					dp[i][j] = i; // Min. operations = i
                }

				// If last characters are same, ignore last
				// char and recur for remaining string
				else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                {
					dp[i][j] = dp[i - 1][j - 1];
                }

				// If the last character is different,
				// consider all possibilities and find the
				// minimum
				else
                {
                    int min_val = dp[i][j - 1];;

                    // int x = dp[i][j - 1]; // Insert
                    // int y = dp[i - 1][j]; // Remove
                    // int z = dp[i - 1][j - 1]; // Replace

                    // if (x <= y && x <= z)
                    // {
                    //     min_val = x;
                    // }
                    // if (y <= x && y <= z)
                    // {
                    //     min_val = y;
                    // }
                    // else
                    // {
                    //     min_val = z;
                    // }

                    if(min_val > dp[i - 1][j]) 
                    {
                        min_val = dp[i - 1][j];
                    }

                    if(min_val > dp[i - 1][j - 1])
                    {
                        min_val = dp[i - 1][j - 1];
                    }

					dp[i][j] = 1 + min_val;
                }
			}
		}

		return dp[m][n];
	}



    // A utility function to get max of two integers
    // 	static int max (int x, int y) { return (x > y)? x : y; }


	
	// Function to find length of the longest palindromic subsequence in seq.
	static int LPS(String seq)
	{
	    
        int n = seq.length();
        int i, j, cl;
        
        // Create a table to store results of subproblems
        int L[][] = new int[n][n];
        
        // Strings of length 1 are palindrome of length 1
        for (i = 0; i < n; i++)
        {
            L[i][i] = 1;
        }
                
        // Build the table. Note that the lower
        // diagonal values of table are
        // useless and not filled in the process.
        // The values are filled in a manner similar
        // to Matrix Chain Multiplication DP solution (See
        // https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/).
        // cl is length of substring
         
        for (cl=2; cl<=n; cl++)
        {
            for (i=0; i<n-cl+1; i++)
            {
                j = i+cl-1;

                if (seq.charAt(i) == seq.charAt(j) && cl == 2)
                {
                    L[i][j] = 2;
                }

                else if (seq.charAt(i) == seq.charAt(j))
                {
                    L[i][j] = L[i+1][j-1] + 2;
                }

                else if(L[i][j-1] >= L[i+1][j])
                { 
                    L[i][j] = L[i][j-1];
                }

                else //if(L[i][j-1] < L[i+1][j])
                {
                    L[i][j] = L[i+1][j];
                }
            }
        }
			
		return L[0][n-1];
	}


}