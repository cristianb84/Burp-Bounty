[
  {
    "ProfileName": "Content-Security-Policy Misconfig",
    "Name": "",
    "Enabled": true,
    "Scanner": 2,
    "Author": "",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,^Content-Security-Policy:(?\u003d(?:(?!default-src).)*$)(?\u003d(?:(?!script-src).)*$|(?:(?!object-src).)*$).+$"
    ],
    "Tags": [
      "SecurityHeaders",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": true,
    "IsContentType": true,
    "ContentType": "text/css,image/jpeg,image/png,image/svg+xml,image/gif,image/tiff,image/webp,image/x-icon,application/font-woff,image/vnd.microsoft.icon,font/ttf,font/woff2,application/javascript,application/octet-stream,text/javascript,image/avif,application/x-javascript",
    "HttpResponseCode": "",
    "NegativeCT": true,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 2,
    "Scope": 2,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Security Headers Misconfig - CSP",
    "IssueSeverity": "Low",
    "IssueConfidence": "Firm",
    "IssueDetail": "Content-Security-Policy Misconfiguration \u003cbr\u003e \u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 0
  }
]