SELECT p.name
FROM products p
JOIN providers pr ON (p.id_providers = pr.id)
WHERE pr.name LIKE 'P%' AND p.amount BETWEEN 10 AND 20;
