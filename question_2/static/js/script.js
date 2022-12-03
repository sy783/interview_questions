// class Queue{

//     constructor() {
//         this.elements = [];
//     }

//     enqueue(element) {
//         return this.elements.push(element);

//     }

//     dequeue(){
//         return this.elements.shift();
//     }

//     //show the first item but not removing it 
//     peek(){
//         return this.elements[0];
//     }

//     getSize(){
//         return this.elements.length;
//     }

//     isEmpty(){
//         return this.getSize() == 0; 
//     }

//     printQueue()
//     {
//         var str = "";
//         for(var i = 0; i < this.elements.length; i++)
//             str += this.elements[i] +" ";
//         return str;
//     }
// }

let ticNumList = [];
let ticNumList2 = []; 
var maxCounters = 4;

function generateTicket(){

    // to generate ticket number
    var ticket = document.getElementById("number");
    var count = ticket.innerHTML;

    var remove, add, count;

   count++;
   alert("Your ticket number is " + count);
   add = ticNumList.push(count);
   document.getElementById("number").innerHTML =  count;

   if(ticNumList.length > maxCounters){

    remove = ticNumList.shift(); //dequeue the ticket number
    ticNumList2.push(remove); //add into a list of dequeued ticket number
    document.getElementById("serving").innerHTML = "Now Serving: " + remove;
    document.getElementById("lastNum").innerHTML = "Last Number: " + count;

   }

   else{

    document.getElementById("serving").innerHTML = "Now Serving: " + remove;
    document.getElementById("lastNum").innerHTML = "Last Number: " + add; 
        
   }

   //to make sure the counters are updated
   if(ticNumList2.length > maxCounters)
   {
        ticNumList2.shift();
   }

   var first = ticNumList2[0];
   if(first == null){

        document.getElementById("myTd1").innerHTML = "No ticket number";
    }
    else
        document.getElementById("myTd1").innerHTML = first;

   var second = ticNumList2[1];
   if(second == null){

       document.getElementById("myTd2").innerHTML = "No ticket number";
   }
   else
       document.getElementById("myTd2").innerHTML = second;

   var third = ticNumList2[2];
   if(third == null){

       document.getElementById("myTd3").innerHTML = "No ticket number";
   }
   else
       document.getElementById("myTd3").innerHTML = third;

   var fourth = ticNumList2[3];
   if(fourth == null){

       document.getElementById("myTd4").innerHTML = "No ticket number";
   }
   else
       document.getElementById("myTd4").innerHTML = fourth;
}


