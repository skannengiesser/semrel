from recommonmark.parser import CommonMarkParser

# for Sphinx-1.4 or newer
extensions = ['recommonmark']

project = u'Gradle semantic-release Plugin'

# for Sphinx-1.3
#from recommonmark.parser import CommonMarkParser

source_parsers = {
    '.md': CommonMarkParser,
}

source_suffix = ['.rst', '.md']