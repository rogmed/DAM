<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body style='font-family: "Gill Sans", "Gill Sans MT", Calibri, "Trebuchet MS", sans-serif; text-align-last:left'>
                <table border="1">
                    <tr>
                        <th width="10%">Tipo</th>
                        <th width="10%">Matrícula</th>
                        <th width="10%">Modelo</th>
                    </tr>
                    <xsl:for-each select="vehiculos/vehiculo">
                        <xsl:choose>
                            <xsl:when test="(tipo='Moto')">
                                <tr bgcolor="#E3FB69"> <!-- AMARILLO -->
                                    <td><xsl:value-of select="tipo"/></td>
                                    <td><xsl:value-of select="matricula"/></td>
                                    <td><xsl:value-of select="modelo"/></td>
                                </tr>
                            </xsl:when>
                            <xsl:when test="(tipo='Coche')">
                                <tr bgcolor="#31DCBD">   <!-- VERDE -->
                                    <td><xsl:value-of select="tipo"/></td>
                                    <td><xsl:value-of select="matricula"/></td>
                                    <td><xsl:value-of select="modelo"/></td>
                                </tr>
                            </xsl:when>
                            <xsl:when test="(tipo='Camión')">
                                <tr bgcolor="#79BDE9"> <!-- AZUL -->
                                    <td><xsl:value-of select="tipo"/></td>
                                    <td><xsl:value-of select="matricula"/></td>
                                    <td><xsl:value-of select="modelo"/></td>
                                </tr>
                            </xsl:when>
                            <xsl:otherwise>
                                <tr>
                                    <th><xsl:value-of select="tipo"/></th>
                                </tr>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>