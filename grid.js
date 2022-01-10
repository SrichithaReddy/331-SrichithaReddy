class employeeDetails
{
    constructor(empId,empName,phnNumber,compname,empsalary)
{
    this.empId = empId;
    this.empName = empName;
    this.phnNumber = phnNumber;
    this.compname = compname;
    this.empsalary = empsalary;
}
display=() =>
{
    var disp = <div style="float:left"><p> Employee ID:${this.empId} Employee Name:${this.empName} contact number:${ this.phnNumber} Company NameSS:${this.compname} Employee empsalary${this.salary}</p></div>
    document.write(disp);
    document.write("<br><br>");

}
};
var e1 = new employeeDetails(301,"srichitha",7661867644,"wipro",50000);
var e2 = new employeeDetails(302,"sai",8935746255,"accenture",45000);
var e3 = new employeeDetails(303,"sritha",9425862436,"amazon",70000);
var e4 = new employeeDetails(304,"prahasith",7625425634,"paytm",65000);
var e5 = new employeeDetails(305,"vinay",7662543945,"infosis",50000);
e1.display();
e2.display();
e3.display();
e4.display();
e5.display();
