select Nombre, Primer_Apellido,Segundo_Apellido, Salario 
from lider l
where Segundo_Apellido = 'Ortiz';

/*select p.ID_Proyecto,l.Nombre,l.Primer_Apellido,l.Segundo_Apellido 
from Proyecto p JOIN Lider l 
WHERE ID_Proyecto BETWEEN 1 AND 25;*/

/*select Ciudad_Residencia, sum(Salario) AS "Suma de salario"
from Lider l 
group by Ciudad_Residencia;*/

/*select lower(SUBSTR(Nombre,-LENGTH(Nombre),1))||UPPER(substr(Nombre,2)) as "nOMBRE"
from Lider l ;*/

select cargo, AVG(Salario) 
from Lider l 
group by Cargo
having avg(salario)>500000
order by Cargo;


/*select AVG(Salario) as "promedio salarial"
from Lider l

select Nombre , Cargo 
from Lider l

select Nombre, Ciudad_Residencia, salario
from Lider l 
where Ciudad_Residencia= "Armenia";*/

select p.ID_Proyecto,l.Nombre,l.Primer_Apellido,l.Segundo_Apellido 
from Proyecto p JOIN Lider l 
WHERE p.ID_Proyecto BETWEEN 1 AND 25 and p.ID_Lider =l.ID_Lider 

select l2.Nombre,l2.Primer_Apellido,l2.Segundo_Apellido
from Lider l2 
where l2.ID_Lider  in 
( select  p.ID_Proyecto 
from  Proyecto p 
where p.ID_Proyecto BETWEEN 1 AND 25);


select *
from Lider l 


select Nombre, Primer_Apellido,Segundo_Apellido, Salario 
from lider l
where Segundo_Apellido = 'Ortiz';

select p.ID_Proyecto,l.Nombre,l.Primer_Apellido,l.Segundo_Apellido 
from Proyecto p JOIN Lider l 
WHERE p.ID_Proyecto BETWEEN 1 AND 25 and p.ID_Lider =l.ID_Lider;

select Ciudad_Residencia, sum(Salario) 
from Lider l 
group by Ciudad_Residencia;

select LOWER(SUBSTR(Nombre,1,1)) || UPPER(SUBSTR(Nombre,2,LENGTH(Nombre))) 
from Lider l ;

select cargo, avg(Salario) 
from Lider l 
group by Cargo
having avg(salario)>500000
order by Cargo;
