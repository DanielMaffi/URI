select  
    CONCAT (
    SUBSTR(n.cpf,1,3),'.',
    SUBSTR(n.cpf,4,3),'.',
    SUBSTR(n.cpf,7,3),'-',
    SUBSTR(n.cpf,10)) as cpf
from natural_person n
join customers c on (n.id_customers = c.id)