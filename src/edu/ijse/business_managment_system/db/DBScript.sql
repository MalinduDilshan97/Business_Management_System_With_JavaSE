drop database company;

create database Company;

use Company;

create table User(
	UID varchar(10) not null,
	UserName varchar(30)not null,
	Password varchar(30)not null,
	constraint primary key (UID)
);

create table Customer(
	CID varchar(10) not null,
	FirstName varchar(30)not null,
	LastName varchar(30)not null,
	NIC varchar(10) not null,
	Contact varchar(15) not null,
	Email varchar(100),
	Address varchar(30),
	constraint primary key (CID)
);

create table CustomerOrder(
	OID varchar(10) not null,
	CID varchar(10) not null,
	Date date,
	constraint primary key (OID),
	constraint foreign key(CID) references Customer(CID)
	on delete cascade on update cascade
);

create table Category(
        catID varchar(30)not null,
	CatName varchar(30)not null,
	constraint primary key (catID)
);

create table Brand(
        BrandID varchar(30)not null,
	BrandName varchar(30)not null,
	constraint primary key (BrandID)
);

create table Item(
	ICode varchar(10) not null,
	catID varchar(30) not null,
	BrandID varchar(30) not null,
	Model varchar(30)not null,
	constraint primary key (ICode),
	constraint foreign key(catID ) references Category(catID )
	on delete cascade on update cascade,
	constraint foreign key(BrandID) references Brand(BrandID)
	on delete cascade on update cascade
);

create table Supplier(
	SID varchar(10) not null,
	SupName varchar(30)not null,
	Contact varchar(15) not null,
	Fax varchar(30),
	Email varchar(100),
	SupAddress varchar(30),
	constraint primary key (SID)
);

create table SupplierOrder(
	SOID varchar(10) not null,
	SID varchar(10) not null,
	Date date,
	constraint primary key (SOID),
	constraint foreign key(SID) references Supplier(SID)
	on delete cascade on update cascade
);

create table SupplierOrderDetail(
	SOID varchar(10) not null,
	ICode varchar(10) not null,
	OrderQty int(10) not null,
	constraint primary key (SOID,ICode),
	constraint foreign key(SOID) references SupplierOrder(SOID)
	on delete cascade on update cascade,
	constraint foreign key(ICode) references Item(ICode)
	on delete cascade on update cascade
);

create table GRN(
	GRNID varchar(10) not null,
	SOID varchar(10) not null,
	Date date,
	constraint primary key (GRNID),
	constraint foreign key(SOID) references SupplierOrder(SOID)
	on delete cascade on update cascade
);

create table GRNDetail(
	GRNID varchar(10) not null,
	ICode varchar(10) not null,
        BuyingPrice double(10,2) not null,
        SellingPrice double(10,2) not null,
	Qty int(10) not null,
	constraint primary key (GRNID,ICode),
	constraint foreign key(GRNID) references GRN(GRNID)
	on delete cascade on update cascade,
	constraint foreign key(ICode) references Item(ICode)
	on delete cascade on update cascade
);

create table SupplierPayment(
	SPID varchar(10) not null,
	GRNID varchar(10) not null,
	Amount decimal(10,2) not null,
	CheckID varchar(10),
	Date date,
	constraint primary key (SPID),
	constraint foreign key(GRNID) references GRN(GRNID)
	on delete cascade on update cascade
);

create table Batch(
	BatchID varchar(10) not null,
	GRNID varchar(10) not null,
	ICode varchar(10) not null,
	BuyingPrice decimal(10,2) not null,
	UnitPrice decimal(10,2) not null,
	QtyOnHand int(10),
	AddedDate date,
	constraint primary key (BatchID),
	constraint foreign key(ICode) references Item(ICode)
	on delete cascade on update cascade,
	constraint foreign key(GRNID) references GRN(GRNID)
	on delete cascade on update cascade
);

create table CustomerOrderDetail(
	OID varchar(10) not null,
	ICode varchar(10) not null,
	BatchID varchar(10) not null,
	UnitPrice decimal(10,2),
	Discount decimal(10,2),
        OrderQty int(10) not null,
	constraint primary key (OID,ICode,BatchID),
	constraint foreign key(OID) references CustomerOrder(OID)
	on delete cascade on update cascade,
	constraint foreign key(ICode) references Item(ICode)
	on delete cascade on update cascade,
	constraint foreign key(BatchID) references Batch(BatchID)
	on delete cascade on update cascade
);

create table CustomerPayment(
	CPID varchar(10) not null,
	OID varchar(10) not null,
	FullAmount decimal(10,2),
	Payment decimal(10,2),
	Date date,
	constraint primary key (CPID),
	constraint foreign key(OID) references CustomerOrder(OID)
	on delete cascade on update cascade
);


