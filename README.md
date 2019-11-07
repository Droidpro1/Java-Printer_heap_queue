The problem is to simulate the operation of a printer that prints the
  jobs according to priority.

   The priority of a job is determined by two factors:

      user_priority:  an integer from 1 to 3   (1 is highest)
      numpages:       pages to be printed


   Job priority = user_priority * numpages

   For example, consider two users:

          Joe:  user_priority = 3, numpages=50
          Sue:  user_priority = 1, numpages=10

          Joe's priority = 3x50 = 150
          Sue's priority = 1x10 = 10

          Since Sue has a high user-priority and is only printing 10 pages, she will 
          have priority over Joe.

   A job to print is represented by a class named Printjob.  It 
   implements Comparable with compareTo based on job priority.

   OutsidePrintjob is derived from PrintJob.  These are just like
   Printjobs, but they compute a cost based on 10 cents per page.

   Another class called Printer reads an input file and create objects
   for each entry.  These objects are added to the priority queue
   using Mark Allen Weiss's BinaryHeap class.  

   The input file contains each job to print on a separate line, with tabs between 
   the fields.  The fields are name, user priority, pages, and a flag indicating 
   inside or outside job (I or O).

   Once the file is read and the print jobs have been added to the binary heap, 
   the Printer object prints its user's name, user priority, 
   and pages to the screen.  OutsidePrintjobs also show their cost.
