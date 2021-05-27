<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body style='font-family: "Gill Sans", "Gill Sans MT", Calibri, "Trebuchet MS", sans-serif; text-align:center'>
                <xsl:for-each select="vehiculos/vehiculo">
                    <div id="tarjeta" style="padding: 10px; border:10px solid grey; margin-top:10px; margin-left:auto; margin-right:auto; margin-bottom:10px; width:50vw; text-align:left;">
                        <div>
                            <div id="vehiculo_foto" style="position:relative; display:inline-block;">
                                <xsl:element name="a">
                                    <xsl:attribute name="href">
                                    <xsl:value-of select="foto"/>
                                    </xsl:attribute>
                                    <xsl:element name="img">
                                        <xsl:attribute name="src">
                                            <xsl:value-of select="foto"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="align">left top</xsl:attribute>
                                        <xsl:attribute name="width">300vw</xsl:attribute>
                                        <xsl:attribute name="width">300vw</xsl:attribute>
                                    </xsl:element>

                                </xsl:element>

                            </div>
                            <div id="vehiculo_datos" style="position:relative; display:inline-block; vertical-align: top;">
                                <div style="text-transform: uppercase; font-weight:bold">
                                    <xsl:value-of select="marca"/>&#160;<xsl:value-of select="modelo"/>
                                </div>
                                <p>
                                    Matrícula: <xsl:value-of select="matricula"/>
                                </p>
                                <p>
                                    Puertas: <xsl:value-of select="puertas"/>
                                </p>
                                <p>
                                    Color: <xsl:value-of select="color"/>
                                </p>
                                <p>
                                    Precio: <xsl:value-of select="precio"/>€
                                </p>
                            </div>
                        </div>
                        <br></br>
                        <div id="vehiculo_comentario">
                            <xsl:value-of select="comentario"/>

                        </div>
                    </div>
                </xsl:for-each>
            </body>
            <footer>@Rogmed | Copyright 2021</footer>
        </html>
    </xsl:template>
</xsl:stylesheet>