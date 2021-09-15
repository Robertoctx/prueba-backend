SELECT SUCURSAL.CODIGO_SUCURSAL, SUCURSAL.NOMBRE_SUCURSAL, SUCURSAL.REGION, COUNT(MEDICO.CODIGO_SUCURSAL) AS "CANTIDAD DE MEDICOS"
FROM SUCURSAL
JOIN MEDICO ON SUCURSAL.CODIGO_SUCURSAL = MEDICO.CODIGO_SUCURSAL
WHERE SUCURSAL.REGION IN ('COS','SIE')
GROUP BY SUCURSAL.CODIGO_SUCURSAL, SUCURSAL.NOMBRE_SUCURSAL, SUCURSAL.REGION
ORDER BY SUCURSAL.CODIGO_SUCURSAL;