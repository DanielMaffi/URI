select p.name,
       c.name
from products p
join categories c on (p.id_categories = c.id)
where p.amount >100 AND p.id_categories in (1,2,3,6,9)