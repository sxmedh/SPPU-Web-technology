<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:template match="/">
    <html>
      <head>
        <title>Student Database</title>
        <style>
          table {
            border-collapse: collapse;
          }
          th {
            background-color: #cccccc;
          }
          .cs-major {
            background-color: #f2f2f2;
          }
        </style>
      </head>
      <body>
        <h1>Student Database</h1>
        <table border="1">
          <tr>
            <th>Student ID</th>
            <th>Name</th>
            <th>Major</th>
            <th>Age</th>
          </tr>
          <xsl:for-each select="students/student">
            <xsl:variable name="major" select="major"/>
            <xsl:if test="$major = 'Computer Science'">
              <tr class="cs-major">
                <td><xsl:value-of select="@id"/></td>
                <td><xsl:value-of select="name"/></td>
                <td><xsl:value-of select="major"/></td>
                <td><xsl:value-of select="age"/></td>
              </tr>
            </xsl:if>
            <xsl:if test="$major != 'Computer Science'">
              <tr>
                <td><xsl:value-of select="@id"/></td>
                <td><xsl:value-of select="name"/></td>
                <td><xsl:value-of select="major"/></td>
                <td><xsl:value-of select="age"/></td>
              </tr>
            </xsl:if>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
  
</xsl:stylesheet>
